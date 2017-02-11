package task_2;
/**
 *  NIM  = 1301154315
 *  Nama = Niko Novian Pratama IF-39-07
 */
public class Mahasiswa
{
    private String NIM, Nama, Status ;
    char [] Nilai;
    int i ;

public Mahasiswa()
{
    Status = "Tidak Lulus";
    i = 0;
    Nilai = new char [10];
}

public Mahasiswa(String nim, String nama)
{
    Nama = nama;
    NIM = nim;
    Status = "Tidak Lulus";
    i = 0;
    Nilai = new char [10];
}
    public String getNIM()
    {
        return NIM;
    }

    public void setNIM(String NIM) 
    {
        this.NIM = NIM;
    }

    public String getNama() 
    {
        return Nama;
    }

    public void setNama(String Nama) 
    {
        this.Nama = Nama;
    }

    public String getStatus()
    {
        return Status;
    }

    public void setStatus(String Status)
    {
        this.Status = Status;
    }
    
    public void addNilai(char nilai)
    {
        if (i <=10){
            Nilai [i] = nilai;
            i++;
        } 
    }
    
    public char getNilai(int i)
    {
        return Nilai [i];
    }
    
    @Override
    public String toString(){
        String n;
        int s;
        n = NIM +","+Nama +","+Status+",nilai = ";
        for (s =0; s < i; s++)
        {
            n = n + Nilai[s] + ",";
        }
        return n;
    }
    
    public char cekNilai(Mahasiswa m){
        char a = 0;
        for (char b = 'A'; b <= 'E'; b++){
            for (int HitungNilai = 0; HitungNilai < i; HitungNilai++){
                if(Nilai [HitungNilai] == b){
                    for (int c = 0; c < m.i; c++){
                        if (m.Nilai[c] == b){
                            return b;
                        }
                    }
                }
            }
        }
    return a ;    
    }
}