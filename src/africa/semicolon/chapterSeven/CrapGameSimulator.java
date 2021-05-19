package africa.semicolon.chapterSeven;

public class CrapGameSimulator {
    static int[] gameWonCounters = new int[20];
    static int[] gameLostCounters = new int[20];

    public static void main(String[] args) {
        CrapGameSimulator simulator = new CrapGameSimulator();
        for (int i = 0; i < 1000; i++) {
            simulator.playOneCrapsGame();
        }
        System.out.println("Games won" + "\t" + "Games lost");
        for (int i = 0; i < 20; i++) {
            System.out.printf("%d%15d%n",gameWonCounters[i], gameLostCounters[i]);
        }

    }

    public void playOneCrapsGame() {
        CrapsGame game = new CrapsGame();
        int gameResultCounter = 0;

        do {
            game.play();
            ++gameResultCounter;
        } while (game.getGameStatus() == CrapStatus.CONTINUE);

        if (gameResultCounter > 20)
            gameResultCounter = 20;
        if (game.getGameStatus() == CrapStatus.WON) {
            gameWonCounters[gameResultCounter - 1] += 1;
        } else if (game.getGameStatus() == CrapStatus.LOST)
            gameLostCounters[gameResultCounter - 1] += 1;
        }
    }

