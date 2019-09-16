package com.hubu.work.utils;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.net.*;

public class t3 extends JFrame{

    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;
    private JTextField filePath = null;
    private JButton openFile = null;
    private JButton playButton = null;
    private File selectedFile;
    private AudioClip audioClip;

    //显示选择的音频文件
    private JTextField getJTextField() {

        if (filePath == null) {
            filePath = new JTextField();
            filePath.setPreferredSize(new Dimension(200, 20));//设置文本框的大小
            filePath.setBackground(Color.WHITE);
            filePath.setEditable(false);//设置文本框不能进行编辑
        }
        return filePath;
    }

    // 获取选择音频文件按钮
    private JButton getOpenFile() {

        if (openFile == null) {
            openFile = new JButton();
            openFile.setText("选择音频");
            openFile.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    JFileChooser fileChooser = new JFileChooser();//文件选择器
                    fileChooser.setFileFilter(new FileNameExtensionFilter("支持的音频文件（*.MP3、*.WAV）", "wav", "WAV", "mp3", "MP3"));//设置支持选择的音频文件格式
                    fileChooser.showOpenDialog(t3.this);
                    selectedFile = fileChooser.getSelectedFile();//获取选择的音频文件
                    filePath.setText(selectedFile.getAbsolutePath());//文本框显示选择的音频文件
                }
            });
        }
        return openFile;
    }

    // 获取播放按钮
    private JButton getPlayButton() {
        if (playButton == null) {
            playButton = new JButton();
            playButton.setText("播放音频");
            playButton.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {

//                    if (selectedFile != null) {

                        try {
                            if (audioClip != null) {//如果有音频在播放
                                audioClip.stop();//停止当前音频的播放
                            }
//                            audioClip = Applet.newAudioClip(selectedFile.toURI().toURL());//获取选择的音频
//                            audioClip.play();//播放音频
                            FileInputStream file=new FileInputStream("music/2.mp3");
//                            AudioStream as=new AudioStream(file);
//                            AudioPlayer.player.start(as);
                            Player player=new Player(file);
                            player.play();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        } catch (JavaLayerException e1) {
                            e1.printStackTrace();
                        }
//                    }
                }
            });
        }
        return playButton;
    }

    public static void main(String[] args) {
        t3 test = new t3();
        test.setVisible(true);

    }

    public t3() {
        super();
        setTitle("Hern");
        setBounds(400, 400, 400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(getJContentPane());

    }


    // 初始化内容面板的方法
    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(new FlowLayout());
            jContentPane.add(getJTextField(), null);
            jContentPane.add(getOpenFile(), null);
            jContentPane.add(getPlayButton(), null);
        }
        return jContentPane;
    }

}
