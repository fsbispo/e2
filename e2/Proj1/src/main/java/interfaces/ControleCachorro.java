package interfaces;

import interfaces.Cachorro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ControleCachorro {
    
    private ArrayList<Cachorro> cachorro = new ArrayList<>();
    
    public boolean salvar(Cachorro ci){
        if (ci != null ){
            cachorro.add(ci);
            return true;
        }else{
            return false;  
        }
    }
    public ArrayList<Cachorro> retornaTodos (){
        return cachorro;
    }
    
    
    private HashSet<String> cachorro1 = new HashSet<>();
    private Map<String,String> nome = new HashMap<>();
    private Map<String,String> raca = new HashMap<>();
    private Map<String,String> sexo = new HashMap<>();
    private Map<String,String> cor = new HashMap<>();
    private Map<String,Integer> idade = new HashMap<>();
    
    public boolean Map(Cachorro i){
        
        if (i != null){
            nome.put("Nome", i.getNome());
            raca.put("Raca", i.getRaca());
            sexo.put("Sexo", i.getSexo());
            cor.put("Cor", i.getCor());
            idade.put("Idade", i.getIdade());
                
            return true;
        } else{
            return false;
        }
    }
    
    public Map<String,String> retornaNome(){
        return nome;
    }
    
    public Map<String,String> retornaRaca(){
        return raca;
    }
    
    public Map<String,String> retornaSexo(){
        return sexo;
    }

    public Map<String,String> retornaCor(){
        return cor;
    }
    
    public Map<String,Integer> retornaIdade(){
        return idade;
    }
    
    public HashSet<String> retornaHashSet(){
        return cachorro1;
    }
    
    public boolean salvarHash(Cachorro i){
        
        if (i != null){
            cachorro1.add(i.getNome());
            return true;
            
        } else{
            return false;
        }
    }
    
    public ArrayList<Cachorro> retornaCachorro(){
        return cachorro;
        
    }
    
}
 
   
    


    
    
    
   
