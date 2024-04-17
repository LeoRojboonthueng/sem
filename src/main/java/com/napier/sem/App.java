package com.napier.sem;

import java.sql.*;

class App {
    public static void main(String[] args) {
        // Create new Application
        App a = new App();

        // Connect to database
        a.connect();
        // Get City
        City city = a.getCity(1);
        // Display results
        a.displayCity(city);

        // Disconnect from database
        a.disconnect();
    }

    /**
     * Connection to MySQL database.
     */
    private Connection con = null;

    /**
     * Connect to the MySQL database.
     */
    public void connect() {
        try {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 10; ++i) {
            System.out.println("Connecting to database...");

            try {
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://sem-db-1:3306/world", "root", "qdrwb");
                System.out.println("Successfully connected");
                break;
            } catch (SQLException sqle) {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());

            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect() {
        if (con != null) {
            try {
                // Close connection
                con.close();
            } catch (Exception e) {
                System.out.println("Error closing connection to database");
            }
        }
    }

    // Method to extract City data
    public City getCity(int ID) {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT * FROM city ";
            // Execute SQL statement on database
            ResultSet rset = stmt.executeQuery(strSelect);
            // Return new city if valid.
            // Check one is returned
            if (rset.next())
            // Setting all columns to variables
            {
                City city = new City();
                city.setID(rset.getInt("ID"));
                city.setName(rset.getString("Name"));
                city.setCountryCode(rset.getString("CountryCode"));
                city.setDistrict(rset.getString("District"));
                city.setPopulation(rset.getString("Population"));
                return city;
            } else
                return null;
        }
        // Catch any exception and provide details
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }
    // A method used to display employee info to the console
    public void displayCity(City city)
    {
        if (city != null)
        {
            System.out.println(
                    city.getID() + " "
                            + city.getName() + " "
                            + city.getCountryCode() + "\n"
                            + city.getDistrict() + "\n"
                            + city.getPopulation() + "\n");
        }
    }
}