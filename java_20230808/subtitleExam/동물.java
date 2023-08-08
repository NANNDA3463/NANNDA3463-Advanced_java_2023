package subtitleExam;

interface 동물 {
    public default String type() {
        return this.getClass().getSimpleName();
    }

}
