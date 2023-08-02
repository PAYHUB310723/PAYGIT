CREATE TABLE users (
                       user_id int NOT NULL,
                       email varchar(255) NOT NULL,
                       first_name varchar(255) NOT NULL,
                       last_name varchar(255) NOT NULL,
                       PRIMARY KEY (user_id)
) ;

-- select version();
select * from users;