import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<String> itemsOnStartingSide = new ArrayList<>();
        itemsOnStartingSide.add("wolf");
        itemsOnStartingSide.add("goat");
        itemsOnStartingSide.add("cabbage");
        int numOfItemsOnStartingSide = 3;


        int numOfItemsOnOtherSide = 0;
        List<String> itemsOnOtherSide = new ArrayList<>();

        while(numOfItemsOnStartingSide != 0 && numOfItemsOnOtherSide != 3){
            //1: Choose item to take to other side of river
            System.out.println("Which item do you want to take to the other side of the river? [Wolf/Goat/Cabbage");
            String choiceToTakeToOtherSide = scan.nextLine().toLowerCase();
            System.out.println(choiceToTakeToOtherSide);
            switch(choiceToTakeToOtherSide){
                case "wolf":
                    if(itemsOnStartingSide.contains("cabbage") && itemsOnStartingSide.contains("goat")){
                        System.out.println("Goal Failed: goat ate cabbage!");
                        break;
                    }else if(!itemsOnStartingSide.contains("wolf")){
                        System.out.println("the wolf is not on this side yet.");
                        break;
                    }else{
                        itemsOnStartingSide.remove("wolf");
                        numOfItemsOnStartingSide--;
                        numOfItemsOnOtherSide++;
                        itemsOnOtherSide.add("wolf");
                        System.out.println("wolf is taken from starting side to other side of river.");
                        System.out.println("there are " + numOfItemsOnStartingSide + " items on the staring side");
                        System.out.println("there are " + numOfItemsOnOtherSide + " items on the other side");
                        break;
                    }
                case "goat":
                    if(!itemsOnStartingSide.contains("goat")){
                        System.out.println("the goat is not on this side yet.");
                        break;
                    }
                    itemsOnStartingSide.remove("goat");
                    numOfItemsOnStartingSide--;
                    numOfItemsOnOtherSide++;
                    itemsOnOtherSide.add("goat");
                    System.out.println("goat is taken from starting side to other side of river.");
                    System.out.println("there are " + numOfItemsOnStartingSide + " items on the staring side");
                    System.out.println("there are " + numOfItemsOnOtherSide + " items on the other side");
                    break;
                case "cabbage":
                    if(itemsOnStartingSide.contains("wolf") && itemsOnStartingSide.contains("goat")){
                        System.out.println("Goal Failed: wolf ate goat!");
                        break;
                    }else if(!itemsOnStartingSide.contains("cabbage")){
                        System.out.println("the cabbage is not on this side yet.");
                        break;
                    }else{
                        itemsOnStartingSide.remove("cabbage");
                        numOfItemsOnStartingSide--;
                        numOfItemsOnOtherSide++;
                        itemsOnOtherSide.add("cabbage");
                        System.out.println("cabbage is taken from starting side to other side of river.");
                        System.out.println("there are " + numOfItemsOnStartingSide + " items on the staring side");
                        System.out.println("there are " + numOfItemsOnOtherSide + " items on the other side");
                        break;
                    }
            }

            //2: Choose item to take from other side of river to starting side
            System.out.println("Do you want to take an item from this side to the starting side? [Yes/No]");
            String yesOrNoChoiceToTakeToStartingSide = scan.nextLine().toLowerCase();
            System.out.println(yesOrNoChoiceToTakeToStartingSide);
            if(yesOrNoChoiceToTakeToStartingSide.equals("yes")){
                System.out.println("Which item do you want to take from the other side of the river to the starting side? [Wolf/Goat/Cabbage");
                String choiceToTakeToStartingSide = scan.nextLine().toLowerCase();
                System.out.println(choiceToTakeToStartingSide);
                switch(choiceToTakeToStartingSide){
                    case "wolf":
                        if(itemsOnOtherSide.contains("cabbage") && itemsOnOtherSide.contains("goat")){
                            System.out.println("Goal Failed: goat ate cabbage!");
                            break;
                        }else if(!itemsOnOtherSide.contains("wolf")){
                            System.out.println("the wolf is not on this side yet.");
                            break;
                        }else{
                            itemsOnOtherSide.remove("wolf");
                            numOfItemsOnOtherSide--;
                            numOfItemsOnStartingSide++;
                            itemsOnStartingSide.add("wolf");
                            System.out.println("wolf is taken from other side to starting side of river.");
                            System.out.println("there are " + numOfItemsOnStartingSide + " items on the staring side");
                            System.out.println("there are " + numOfItemsOnOtherSide + " items on the other side");
                            break;
                        }
                    case "goat":
                        if(!itemsOnOtherSide.contains("goat")){
                            System.out.println("the goat is not on this side yet.");
                            break;
                        }
                        itemsOnOtherSide.remove("goat");
                        numOfItemsOnOtherSide--;
                        numOfItemsOnStartingSide++;
                        itemsOnStartingSide.add("goat");
                        System.out.println("goat is taken from other side to starting side of river.");
                        System.out.println("there are " + numOfItemsOnStartingSide + " items on the staring side");
                        System.out.println("there are " + numOfItemsOnOtherSide + " items on the other side");
                        break;
                    case "cabbage":
                        if(itemsOnOtherSide.contains("wolf") && itemsOnOtherSide.contains("goat")){
                            System.out.println("Goal Failed: wolf ate goat!");
                            break;
                        }else if(!itemsOnOtherSide.contains("cabbage")){
                            System.out.println("the cabbage is not on this side yet.");
                            break;
                        }else{
                            itemsOnOtherSide.remove("cabbage");
                            numOfItemsOnOtherSide--;
                            numOfItemsOnStartingSide++;
                            itemsOnStartingSide.add("cabbage");
                            System.out.println("cabbage is taken from other side to starting side of river.");
                            System.out.println("there are " + numOfItemsOnStartingSide + " items on the staring side");
                            System.out.println("there are " + numOfItemsOnOtherSide + " items on the other side");
                            break;
                        }
                }
            }
            else if(yesOrNoChoiceToTakeToStartingSide.equals("no")){
                System.out.println("the peasant travels back from the other side to the starting side with no item");
            }
        }
        System.out.println("Congratulations! The peasant has gotten all three items across.");
    }
}


