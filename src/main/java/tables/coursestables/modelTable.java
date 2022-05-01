package tables.coursestables;

public class modelTable {
    String courseCode, courseName, lectureLocation, lectureTime, sectionLocation, sectionTime;

    public modelTable(String courseCode, String courseName, String lectureLocation, String lectureTime, String sectionLocation, String sectionTime){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lectureLocation = lectureLocation;
        this.lectureTime = lectureTime;
        this.sectionLocation = sectionLocation;
        this.sectionTime= sectionTime;
    }
    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }
    public String getCourseCode(){
        return courseCode;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setLectureLocation(String lectureLocation){
        this.lectureLocation = lectureLocation;
    }
    public String getLectureLocation(){
        return lectureLocation;
    }
    public void  setLectureTime(String lectureTime){
        this.lectureTime = lectureTime;
    }
    public String getLectureTime(){
        return lectureTime;
    }
    public void setSectionLocation(String sectionLocation){
        this.sectionLocation = sectionLocation;
    }
    public String getSectionLocation(){
        return sectionLocation;
    }

    public void setSectionTime(String sectionTime){
        this.sectionTime = sectionTime;
    }
    public String getSectionTime(){
        return sectionTime;
    }
}
