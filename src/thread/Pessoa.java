package thread;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pessoa {

    private long id;
    private String nome;
    private String dataNasc;
    private String email;
    private float peso;
    private int altura;
    private String sexo;

    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);

    public Pessoa(String nome, String dataNasc, String email, float peso, int altura, String sexo) throws Exception {
        this.id = 1L;
        this.nome = nome;
        this.dataNasc = dataNasc;
        setEmail(email);
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public Pessoa(long id, String nome, String dataNasc, String email, float peso, int altura, String sexo) throws Exception {
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        setEmail(email);
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public long getId() {
        return id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            this.email = email;
            return;
        }
        throw new Exception("Email invalido!!!");
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getImc() {
        final float alturaEmMetros = Float.valueOf(getAltura())/100;
        return getPeso() / (alturaEmMetros * alturaEmMetros);
    }
}
