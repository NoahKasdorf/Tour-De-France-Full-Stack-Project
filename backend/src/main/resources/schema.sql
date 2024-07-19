DROP TABLE IF EXISTS "cyclists";
DROP TABLE IF EXISTS "teams";

-- Create the teams table
CREATE TABLE teams (
    id SERIAL PRIMARY KEY,          -- Auto-incrementing unique ID
    name VARCHAR(100) NOT NULL,     -- Team name cannot be null
    country VARCHAR(100) NOT NULL,  -- Country cannot be null
    bike_brand VARCHAR(100) NOT NULL -- Bike brand cannot be null
);

-- Create the cyclists table
CREATE TABLE cyclists (
    id SERIAL PRIMARY KEY,           -- Auto-incrementing unique ID
    first_name VARCHAR(100) NOT NULL, -- First name cannot be null
    last_name VARCHAR(100) NOT NULL,  -- Last name cannot be null
    team_id INT,                      -- Team ID (foreign key)
    FOREIGN KEY (team_id) REFERENCES teams(id) ON DELETE SET NULL -- Set to null if the referenced team is deleted
);