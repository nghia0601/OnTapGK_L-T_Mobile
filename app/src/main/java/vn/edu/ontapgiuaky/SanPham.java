package vn.edu.ontapgiuaky;

public class SanPham {
    String tenSP;
    Double giaSP;
    int images;

    public SanPham(String tenSP, Double giaSP, int images) {
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.images = images;
    }
    public SanPham(String tenSP, Double giaSP) {
        this.tenSP = tenSP;
        this.giaSP = giaSP;
    }
    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(Double giaSP) {
        this.giaSP = giaSP;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
