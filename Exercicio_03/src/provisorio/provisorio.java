/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provisorio;

/**
 *
 * @author Pedro Francisco
 */
public class provisorio {
    private int x = 0;
    private int y = 0;

    public provisorio(){
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public provisorio(int x, int y) throws Exception{
        if(x <= 0) throw new Exception ("X não pode ser menor ou igual 0");
        this.x = x;
        if(y < 0) throw new Exception ("Y não pode ser menor 0");
        this.y = y;
    }
    
    public long calculoInterativo(int x, int y){
        if(y == 0) return 1;
        long z = 1;
        
            for(int i = 0; i < y; i++){
                z *= x;
            }

        return z;
    }
    
    public long calculoRecursivo(int x, int y){
        if (y == 0) return 1;
        return x * calculoRecursivo(x, y - 1);
    }
}
