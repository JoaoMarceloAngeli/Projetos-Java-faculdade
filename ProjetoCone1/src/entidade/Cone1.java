/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

public class Cone1 {
    private float Raio = 0;
    private float Altura = 0;
    
    public Cone1(){
    }
     public Cone1(float Raio, float Altura)throws Exception {
        if(Raio <= 0) 
            throw new Exception("O peso não pode ser <= 0");
        this.Raio = Raio;
        if(Altura <= 0) 
            throw new Exception("A altura não pode ser <= 0");
        this.Altura = Altura;
        
    }
    
    public void setRaio(float Raio) throws Exception {
        if(Raio <= 0) 
            throw new Exception("O Raio não pode ser <= 0");
        this.Raio = Raio;}
    
     public float getAltura(){
        return Altura;
    }
        public void setAltura(float Altura) throws Exception {
        if(Altura <= 0) 
            throw new Exception("A altura não pode ser <= 0");
        this.Altura = Altura;}
        
    public float getGeratriz(){
        return (float) Math.sqrt(((Raio*Raio)+(Altura*Altura))) ;
    }
    public float getVolumeLateral(){
        return (float)( 3.1415 * Raio * Math.sqrt(((Raio*Raio)+(Altura*Altura)))) ;
    }
    public float getVolumeTotal(){
        return (float)(3.1415*Raio*(Math.sqrt(((Raio*Raio)+(Altura*Altura)))+Raio));
    }
    public float getVolume(){
        return (float)((3.1415*Raio*Raio*Altura)/3);
     }

    @Override
    public String toString() {
        return "Paciente{" + ", Raio=" + Raio + ", altura=" + Altura + '}';
    }
}
