/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NOMINA;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

/**
 *
 * @author Mayela
 */
class Archivonominaempleado {

    
    
    atri e=new atri();
   RandomAccessFile raf;
    File f;
    
     private final int MAX=500;
    private atri dao;
    private List<atri> controls ;

    public Archivonominaempleado (String nombre){
       try{ 
          f=new File(nombre+".txt"); 
        if(!f.exists()){
             raf=new RandomAccessFile(f, "rw");
	      raf.seek(0);
	       raf.writeInt(0);
        
        }
        else{ 
            raf= new RandomAccessFile(f, "rw");
}
       }catch(Exception ex){}
    }

  public  Archivonominaempleado() {
         
    }
       public void create(atri object) throws IOException{
         raf.seek(0);
         int n=raf.readInt();    
       
       if (object == null) {
            return;
        }
        

        long pos = 4 + MAX * n;
        raf.seek(pos);

        raf.writeInt(object.getId());
        raf.writeUTF(object.getNombre());
        raf.writeUTF(object.getOficio());
        raf.writeInt(object.getINSS());        
        raf.writeDouble(object.getSalario());
        raf.writeDouble(object.getExtra());
        raf.writeDouble(object.getAntiguedad());
        raf.writeDouble(object.getTotal());
        raf.writeDouble(object.getInss());
        raf.writeDouble(object.getIr());
        raf.writeDouble(object.getDeduccion());
        raf.writeDouble(object.getTOTALPAGO());

      
	raf.seek(0);
	raf.writeInt(++n);
    

    }

    public atri find(int id) throws IOException {
      
        
        long pos =4 + MAX *(id-1);
         raf.seek(pos);
      
        e.setId(raf.readInt()); 
        e.setNombre(raf.readUTF().trim());
        e.setINSS(raf.readInt());
        e.setOficio(raf.readUTF().trim());
        e.setSalario(raf.readDouble());
        e.setExtra(raf.readDouble());
        e.setAntiguedad(raf.readDouble());
        e.setTotal(raf.readDouble());
        e.setInss(raf.readDouble());
        e.setIr(raf.readDouble());
        e.setDeduccion(raf.readDouble());
        e.setTOTALPAGO(raf.readDouble());
        
        raf.seek(0);
        
 
       
       
        return e;
        
    }
    public int getId()throws IOException{
     raf.seek(0);
     int n=raf.readInt();
     return n; 
    }
 

    void Modificar(int id2,String de, double prec, double stoc) throws IOException {
        raf.seek(0);
    
     if(id2!=-1){   
      
        long pos=4+id2*MAX;
        raf.seek(pos);
        
        raf.writeUTF(de);
         raf.writeDouble(prec);
 
        raf.seek(0);
     } 
    }
    public atri Id(int id) throws IOException {
        raf.seek(0);
        int k = raf.readInt();
        if (id < 0 & id > k) {
            return null;
        }

        int pos = 8 + (id - 1) * MAX;
        raf.seek(pos);
        dao = new atri();
   
        dao.setId(raf.readInt()); 
        dao.setNombre(raf.readUTF().trim());
        dao.setINSS(raf.readInt());
        dao.setOficio(raf.readUTF().trim());
        dao.setSalario(raf.readDouble());
        dao.setExtra(raf.readDouble());
        dao.setAntiguedad(raf.readDouble());
        dao.setTotal(raf.readDouble());
        dao.setInss(raf.readDouble());
        dao.setIr(raf.readDouble());
        dao.setDeduccion(raf.readDouble());
        dao.setTOTALPAGO(raf.readDouble());
      

        return dao;
    }
    public List<atri> Mostrar() throws IOException {
         raf.seek(0);
        int n = raf.readInt();
      
        for (int i = 1; i < n; i++) {
            atri e1 = find(i);
            if (e1 == null) {
                continue;
            }
            controls.add(e1);
        }
    
        return  controls;
    }
    
}
