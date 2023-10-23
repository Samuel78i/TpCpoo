package ex2;

public class GenLib {
    public static RandGen random(int max){
        RandGen result = new RandGen();
        result.setMax(max);
        return result;
    }
    public static AriSuiteGen ariSuite(int max){
        AriSuiteGen result = new AriSuiteGen();
        return result;
    }
    public static GeoSuiteGen geoSuite(int max){
        GeoSuiteGen result = new GeoSuiteGen();
        return result;
    }
    public static FiboGen fibo(int max){
        FiboGen result = new FiboGen();
        return result;
    }
}
