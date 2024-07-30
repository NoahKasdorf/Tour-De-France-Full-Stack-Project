-- Drop tables if they exist
DROP TABLE IF EXISTS cyclists;
DROP TABLE IF EXISTS teams;


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
(2, 'Wout', 'Van Aert', 80.0, 'Belgium', 1),
(3, 'Steven', 'Kruijswijk', 70.0, 'Netherlands', 1),
(4, 'Tom', 'Dumoulin', 72.0, 'Netherlands', 1),
(5, 'Sepp', 'Kuss', 64.0, 'USA', 1),
(6, 'Tadej', 'Pogačar', 66.0, 'Slovenia', 2),
(7, 'João', 'Almeida', 70.0, 'Portugal', 2),
(8, 'Rafael', 'Majka', 68.0, 'Poland', 2),
(9, 'Matteo', 'Trentin', 75.0, 'Italy', 2),
(10, 'Alexander', 'Kristoff', 81.0, 'Norway', 2),
(11, 'Emmanuel', 'Buchmann', 70.0, 'Germany', 3),
(12, 'Nicolas', 'Rosa', 72.0, 'Italy', 3),
(13, 'Sergio', 'Henao', 68.0, 'Colombia', 3),
(14, 'Rafael', 'Valls', 73.0, 'Spain', 3),
(15, 'Cameron', 'Wurf', 76.0, 'Australia', 3);

