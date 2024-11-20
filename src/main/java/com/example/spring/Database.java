package com.example.spring;

public class Database {

    private static Database database;

    public static Database getInstance(){
        if (database == null) {
            database = new Database();
        }

        return database;
    }

    private Database(){ // constructor yang diprivate
        // agar tidak bisa membuat objeknya dari luar class ini
    }


}
