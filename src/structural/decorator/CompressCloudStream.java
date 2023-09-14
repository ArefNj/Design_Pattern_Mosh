package structural.decorator;

public class CompressCloudStream implements Stream{

    private Stream stream;

    public CompressCloudStream(Stream stream) {
        this.stream = stream;
    }


    @Override
    public void write(String data) {
        var compressed = compress(data);
        stream.write(compressed);
    }

    private String compress(String data){
        return data.substring(0,5);
    }
}
