package DPCreationale.STBBuilder.builder;

public class AutobuzBuilder implements IBuilderAutobuz{

    private  String model;
    private  String sofer;

    private  boolean  opririCapat;
    private   boolean opririStatie;
    private  String text;
    private  int capacitate;

    public AutobuzBuilder(String model, String sofer) {
        this.model = model;
        this.sofer = sofer;
        this.capacitate = 0;
        this.opririCapat = false;
        this.opririStatie = false;
        this.text = "N/A";
    }


    public AutobuzBuilder setCapacitate(int capacitate) {
        this.capacitate = capacitate;
        return this;
    }

    public AutobuzBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public AutobuzBuilder setOpririCapat(boolean opririCapat) {
        this.opririCapat = opririCapat;
        return this;
    }

    public AutobuzBuilder setOpririStatie(boolean opririStatie) {
        this.opririStatie = opririStatie;
        return this;
    }

    public AutobuzBuilder setSofer(String sofer) {
        this.sofer = sofer;
        return this;
    }

    public AutobuzBuilder setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public AutobuzLinie build() {
        AutobuzLinie a1 = new AutobuzLinie(this. model, this. sofer, this. opririCapat, this. opririStatie, this. text, this. capacitate);
        return a1 ;
    }
}
