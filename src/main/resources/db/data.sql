INSERT INTO `user` (id, username, password, head_portrait,personal_signature,nickname) VALUES (1, 'root', '1234', 'admin','pictures/1.jpg','咱家李沁真好看');
INSERT INTO `user` (id, username, password, head_portrait,personal_signature,nickname) VALUES (2, 'user', '1234', 'user', 'pictures/2.jpg','咱家战战也不赖');


INSERT INTO `song_sheet` (id, name, author, time,click_throughput,state) VALUES (1, '咱家战战', '1234', '2019-11-21','11','Y');
INSERT INTO `song_sheet` (id, name, author, time,click_throughput,state) VALUES (2, '咱家李沁', '1234', '2019-11-20','11','N');

COMMIT;