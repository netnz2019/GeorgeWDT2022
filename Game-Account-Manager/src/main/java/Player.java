/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;
public class Player implements java.io.Serializable{
  private String username;
  private int id;
  private int accuracy;
  private int wins;
  private int losses;
  private int kills;
  private int deaths;
  private int assists;
  private int points;
  
  public Player (String username, int id, int accuracy, int wins, int losses, int kills, int deaths, int assists, int points){
    this.username = username;
    this.id = id;
    this.accuracy = accuracy;
    this.wins = wins;
    this.losses = losses;
    this.kills = kills;
    this.deaths = deaths;
    this.assists = assists;
    this.points = points;

    
  }
  public String getUsername(){
    return this.username;
  }
  
  public int getID(){
    return this.id;
  }
  
  public int getAccuracy(){
    return this.accuracy;
  }
  
  public int getWins(){
    return this.wins;
  }
  
  public int getLosses(){
    return this.losses;
  }
  
  public int getKills(){
    return this.kills;
  }
  
  public int getDeaths(){
    return this.deaths;
  }
  
  public int getAssists(){
    return this.assists;
  }
  
  public int getPoints(){
    return this.points;
  }
  
  
  public void setUsername(String username){
    this.username = username;
  }
  public void setID(int id){
  this.id = id;
  }
  public void setAccuracy(int accuracy){
  this.accuracy = accuracy;
  }
  public void setWins(int wins){
  this.wins = wins;
  }
  public void setLosses(int losses){
  this.losses = losses;
  }
  public void setKills(int kills){
  this.kills = kills;
  }
  public void setDeaths(int deaths){
  this.deaths = deaths;
  }
  public void setAssists(int assists){
  this.assists = assists;
  }
  public void setPoints(int points){
  this.points = points;
  }
}
