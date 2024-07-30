-- Drop tables if they exist
DROP TABLE IF EXISTS cyclists;
DROP TABLE IF EXISTS teams;
DROP TABLE IF EXISTS managers;
DROP TABLE IF EXISTS routes;
DROP TABLE IF EXISTS stages;

-- Create the teams table
CREATE TABLE teams (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    country VARCHAR(255) NOT NULL,
    bike_brand VARCHAR(255) NOT NULL
);

-- Create the cyclists table
CREATE TABLE cyclists (
    id INT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    weight DECIMAL(5, 2),
    country VARCHAR(255) NOT NULL,
    team_id INT,
    FOREIGN KEY (team_id) REFERENCES teams(id)
);

-- Insert data into teams table
INSERT INTO teams (id, name, country, bike_brand) VALUES
(1, 'Team Jumbo-Visma', 'Netherlands', 'Cervelo'),
(2, 'UAE Team Emirates', 'UAE', 'Colnago'),
(3, 'Bora-Hansgrohe', 'Germany', 'Specialized');


-- Insert data into cyclists table
INSERT INTO cyclists (id, first_name, last_name, weight, country, team_id) VALUES
(1, 'Jonas', 'Vingegaard', 60.0, 'Denmark', 1),
(2, 'Tadej', 'Pogačar', 66.0, 'Slovenia', 2),
(3, 'Geraint', 'Thomas', 69.0, 'UK', 3),
(4, 'Mikel', 'Landa', 61.0, 'Spain', 4),
(5, 'David', 'Gaudu', 53.0, 'France', 5),
(6, 'Jai', 'Hindley', 62.0, 'Australia', 6);

