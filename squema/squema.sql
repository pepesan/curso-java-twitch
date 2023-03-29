use test;

CREATE TABLE language (
                          language_id TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
                          name CHAR(20) NOT NULL,
                          last_update TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                          PRIMARY KEY (language_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;