CREATE TABLE IF NOT EXISTS cidades (
	id INT UNSIGNED NOT NULL auto_increment,
    nome VARCHAR(255) NOT NULL,
    estado_id INT UNSIGNED NOT NULL,
    area DECIMAL(10,2),
    PRIMARY KEY (id),
    FOREIGN KEY (estado_id) REFERENCES estados (id)
);

CREATE TABLE IF NOT EXISTS teste (
	id INT UNSIGNED NOT NULL auto_increment PRIMARY KEY
);

DROP TABLE IF EXISTS teste;