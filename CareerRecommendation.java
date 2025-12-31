import java.util.*;

public class CareerRecommendation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== AI Career Recommendation System ===\n");

        System.out.print("Enter your skills (comma separated): ");
        String skillsInput = sc.nextLine().toLowerCase();

        System.out.print("Enter your interest area: ");
        String interest = sc.nextLine().toLowerCase();

        List<String> skills = Arrays.asList(skillsInput.split(","));

        String career = recommendCareer(skills, interest);

        System.out.println("\n🎯 Recommended Career Path:");
        System.out.println("👉 " + career);

        sc.close();
    }

    static String recommendCareer(List<String> skills, String interest) {

        if (skills.contains("python") && skills.contains("machine learning")) {
            return "Data Scientist / Machine Learning Engineer";
        }

        if (skills.contains("java") && skills.contains("oop")) {
            return "Software Engineer (Backend / Java Developer)";
        }

        if (skills.contains("html") && skills.contains("css") && skills.contains("javascript")) {
            return "Web Developer / Frontend Engineer";
        }

        if (skills.contains("sql") && interest.contains("data")) {
            return "Data Analyst / Business Analyst";
        }

        if (skills.contains("ai") || interest.contains("ai")) {
            return "Artificial Intelligence Engineer";
        }

        return "Career path unclear – consider skill enhancement in a focused domain";
    }
}
