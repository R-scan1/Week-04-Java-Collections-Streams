package byteArray_stream_convert_image_to_byteArray;

public class Main {
    public static void main(String[] args) {
        String sourceImagePath = "src/main/resources/lord.jpg";
        String outputImagePath = "src/main/resources/lordCopy.jpg";

        byte[] imageBytes = ImageConverter.imageToByteArray(sourceImagePath);
        if (imageBytes != null) {
            System.out.println("Image successfully converted to byte array. Size: " + imageBytes.length + " bytes");
        }

        ImageConverter.byteArrayToImage(imageBytes, outputImagePath);
    }
}
