package Udemy.Game;

public abstract class GameObject {
    public abstract void draw();

    public static void main(String[] args) {
        GameObject player = new Player();
//        player.draw();
        GameObject menu = new Menu();
//        menu.draw();

        GameObject[] gameObjects = new GameObject[2];
        gameObjects[1] = player;
        gameObjects[0] = menu;

        for (GameObject obj : gameObjects){
            obj.draw();
        }

        //GameObject mwObject = new GameObject();
    }
}
