package dominando.android.activity;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Cliente implements Serializable {
    public int codigo;
    public String nome;
    public Cliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
}
