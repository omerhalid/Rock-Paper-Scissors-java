public class Game {
    Options typeItem;
    Options computerTypeItem;

    public Game(int typeItem, int computerTypeItem){
        this.typeItem = getType(typeItem);
        this.computerTypeItem = getType(computerTypeItem);
    }

    private Options getType(int type) {
        switch(type){
            case 1:
                return Options.ROCK;
            case 2:
                return Options.PAPER;
            case 3:
                return Options.SCISSORS;
            default:
                throw new IllegalArgumentException("Invalid typeItem");
        }
    }

    public Options getTypeItem() {
        return typeItem;
    }

    public Options getComputerTypeItem() {
        return computerTypeItem;
    }

    enum Options{
        ROCK,
        PAPER,
        SCISSORS
    }

    public String gameLogic() {
        if (typeItem == computerTypeItem) {
            return "It's a tie!";
        }

        switch (typeItem) {
            case ROCK:
                return (computerTypeItem == Options.SCISSORS) ? "You win!" : "Computer wins!";
            case PAPER:
                return (computerTypeItem == Options.ROCK) ? "You win!" : "Computer wins!";
            case SCISSORS:
                return (computerTypeItem == Options.PAPER) ? "You win!" : "Computer wins!";
            default:
                throw new IllegalStateException("Unexpected value: " + typeItem);
        }
    }
}
