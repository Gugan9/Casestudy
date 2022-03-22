package sampleprogram;

public class Musicsong {
private int id;
private String title;
private String artist;
private String ablum;
private String location;
private String decrisption;
public Musicsong() {
	super();
}
public Musicsong(int id, String title, String artist, String ablum, String location, String decrisption) {
	super();
	this.id = id;
	this.title = title;
	this.artist = artist;
	this.ablum = ablum;
	this.location = location;
	this.decrisption = decrisption;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public  String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
public String getAblum() {
	return ablum;
}
public void setAblum(String ablum) {
	this.ablum = ablum;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getDecrisption() {
	return decrisption;
}
public void setDecrisption(String decrisption) {
	this.decrisption = decrisption;
}

}
