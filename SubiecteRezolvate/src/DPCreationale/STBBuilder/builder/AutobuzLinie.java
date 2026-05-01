package DPCreationale.STBBuilder.builder;

public class AutobuzLinie {

    private final String model;
    private final String sofer;

    private final boolean  opririCapat;
    private final boolean opririStatie;
    private final String text;
    private final int capacitate;


    public  AutobuzLinie(String model, String sofer, boolean opririCapat, boolean opririStatie, String text, int capacitate){
        this.model = model;
        this.sofer = sofer;
        this.opririCapat = opririCapat;
        this.opririStatie = opririStatie;
        this.text = text;
        this.capacitate = capacitate;
    };

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie: ");
        sb.append("capacitate=").append(capacitate);
        sb.append(", model='").append(model).append('\'');
        sb.append(", sofer='").append(sofer).append('\'');
        sb.append(", opririCapat=").append(opririCapat);
        sb.append(", opririStatie=").append(opririStatie);
        sb.append(", text='").append(text).append('\'');
        return sb.toString();
    }

    public int getCapacitate() {
        return capacitate;
    }


    public String getModel() {
        return model;
    }



    public boolean isOpririCapat() {
        return opririCapat;
    }



    public boolean isOpririStatie() {
        return opririStatie;
    }



    public String getSofer() {
        return sofer;
    }



    public String getText() {
        return text;
    }

}
