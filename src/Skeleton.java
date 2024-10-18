public class Skeleton extends Boss{
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public void bossInfo() {
        super.bossInfo();
        System.out.println("стрелы = " + getArrows());
    }
}
