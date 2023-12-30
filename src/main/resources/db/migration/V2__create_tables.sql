CREATE TABLE writer (
  id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  first_name VARCHAR(255),
  last_name VARCHAR(255)

);


CREATE TYPE post_status_enum AS ENUM ('ACTIVE', 'UNDER_REVIEW', 'DELETED');


CREATE TABLE post (
  id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  content VARCHAR(255),
  created VARCHAR(255),
  updated VARCHAR(255),
  writer_id INT,
  status post_status_enum,
  FOREIGN KEY (writer_id) REFERENCES writer (id)
);

CREATE TABLE label (
  id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  name VARCHAR(255)
);

CREATE TABLE post_labels (
  postId INT,
  labelId INT,
  FOREIGN KEY (postId) REFERENCES post (id),
  FOREIGN KEY (labelId) REFERENCES label (id)
);