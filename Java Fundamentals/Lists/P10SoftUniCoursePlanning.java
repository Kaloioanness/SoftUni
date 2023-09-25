package JavaFundamentals.Excercises.Lists;

import java.util.*;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialExAndLessons = new ArrayList<>(Arrays.asList(scanner.nextLine().split(", ")));
        String command = scanner.nextLine();
        while (!command.equals("course start")){

            String[] commandParts = command.split(":");
            String commandName = commandParts[0];
            String lessonTitle = commandParts[1];

            switch (commandName){

                case "Add":

                    if (!initialExAndLessons.contains(lessonTitle)){
                        initialExAndLessons.add(lessonTitle);
                    }
                    break;

                case "Insert":
                    int index = Integer.parseInt(commandParts[2]);
                    if (!initialExAndLessons.contains(lessonTitle)){
                        initialExAndLessons.add(index,lessonTitle);
                    }
                    break;
                case "Remove":
                    if (initialExAndLessons.contains(lessonTitle)){
                        initialExAndLessons.remove(lessonTitle);
                    }
                    break;
                case "Swap":
                    String lessonTitle2 = commandParts[2];
                    int indexOfTitle1 = initialExAndLessons.indexOf(lessonTitle);
                    int indexOfTitle2 = initialExAndLessons.indexOf(lessonTitle2);
                    if (initialExAndLessons.contains(lessonTitle) && initialExAndLessons.contains(lessonTitle2)){
                        Collections.swap(initialExAndLessons,indexOfTitle1,indexOfTitle2);
                        String exerciseFirst = lessonTitle + "-Exercise";
                        String exerciseSecond = lessonTitle2 + "-Exercise";

                        if (initialExAndLessons.contains(exerciseFirst)){
                            initialExAndLessons.remove(exerciseFirst);
                            initialExAndLessons.add(initialExAndLessons.indexOf(lessonTitle) + 1,exerciseFirst);
                        }
                        if (initialExAndLessons.contains(exerciseSecond)){
                            initialExAndLessons.remove(exerciseSecond);
                            initialExAndLessons.add(initialExAndLessons.indexOf(lessonTitle2) + 1,exerciseSecond);
                        }
                    }
                    break;
                case "Exercise":
                    String exerciseName = lessonTitle + "-Exercise";
                    if (initialExAndLessons.contains(lessonTitle)){
                        int indexOfLesson = initialExAndLessons.indexOf(lessonTitle);
                        if (indexOfLesson == initialExAndLessons.size()-1){
                            initialExAndLessons.add(indexOfLesson + 1, exerciseName);
                        } else if (!initialExAndLessons.get(indexOfLesson + 1).equals(exerciseName)) {
                            initialExAndLessons.add(indexOfLesson + 1, exerciseName);
                        }
                    }else {
                        initialExAndLessons.add(lessonTitle);
                        initialExAndLessons.add(exerciseName);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < initialExAndLessons.size() ; i++) {
            String current = initialExAndLessons.get(i);
            System.out.println((i+1) + "." + current);
        }
    }
}
