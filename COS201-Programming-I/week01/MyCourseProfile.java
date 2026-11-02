public class MyCourseProfile {

    static void line(String label, String value) {
        System.out.println(label + ": " + value);
    }

    public static void main(String[] args) {
        String[] reasons = {
            "Programming teaches me to think step by step.",
            "Programming lets computers do repetitive work for me.",
            "Programming is how useful applications are created."
        };

        System.out.println("##### COS 201 WEEK 1 #####");
        line("Course", "COS 201 - Computer Programming I");
        line("Name", "Raji Samad Ayomide");
        line("Matric No", "25/18323");
        line("Programme", "Computer Science");

        for (int i = 0; i < reasons.length; i++) {
            line("Reason " + (i + 1), reasons[i]);
        }

        line("My goal", "To build a small program that helps people.");
        System.out.println("Status: my first Java programme ran successfully.");
        System.out.println("Promise: I will practise coding every week.");
    }
}
