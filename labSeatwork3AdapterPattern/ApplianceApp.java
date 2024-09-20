public class ApplianceApp {
    public static void main(String[] args){

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        SchoolManagementApp attendanceSystemSMA = new AttendanceSystemAdapter(attendanceSystem);

        GradingSystem gradingSystem = new GradingSystem();
        SchoolManagementApp gradingSystemSMA = new GradingSystemAdapter(gradingSystem);

        LibrarySystem librarySystem = new LibrarySystem();
        SchoolManagementApp librarySystemSMA = new LibrarySystemAdapter(librarySystem);

        // integrate
        System.out.println(attendanceSystemSMA.integrateSystem());
        System.out.println(gradingSystemSMA.integrateSystem());
        System.out.println(librarySystemSMA.integrateSystem());

    }
}
