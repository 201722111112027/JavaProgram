INSERT INTO `user` (id, username, password, head_portrait,personal_signature,nickname) VALUES (1, 'root', '1234', 'admin','pictures/1.jpg','咱家李沁真好看');
INSERT INTO `user` (id, username, password, head_portrait,personal_signature,nickname) VALUES (2, 'user', '1234', 'user', 'pictures/2.jpg','咱家战战也不赖');


INSERT INTO `song_sheet` (id, name, author, time,click_throughput,state) VALUES (1, '咱家战战', '1234', '2019-11-21','11','Y');
INSERT INTO `song_sheet` (id, name, author, time,click_throughput,state) VALUES (2, '咱家李沁', '1234', '2019-11-20','11','N');

INSERT INTO `songs` (id, name, author, url,url_words,click_throughput,ascription,state) VALUES (1, '十年', '陈奕迅', 'music/2.mp3','contents/1.txt',111,'咱家战战','N');
INSERT INTO `songs` (id, name, author, url,url_words,click_throughput,ascription,state) VALUES (2, '稻香', '周杰伦', 'music/2.mp3','contents/1.txt',111,'咱家李沁','N');

INSERT INTO `comment` (id, author, content,praisePoints,publicationTime,commentAim) VALUES (1, 'gxm', '好听', 22,'2019-12-19','十年');
INSERT INTO `comment` (id, author, content,praisePoints,publicationTime,replayId) VALUES (2, 'whm', '认同', 21,'2019-12-19',1);
INSERT INTO `comment` (id, author, content,praisePoints,publicationTime,replayId) VALUES (3, 'lx', '点赞', 21,'2019-12-19',1);
INSERT INTO `comment` (id, author, content,praisePoints,publicationTime,replayId) VALUES (4, 'lx', '点赞', 21,'2019-12-19',1);

COMMIT;