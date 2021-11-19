package Nada2;

public class Phone {
    int countryCode;
    int areaCode;
    int lineNumber;

    public Phone(int countryCode) {
        this.countryCode = countryCode;
    }

    public Phone(int countryCode, int areaCode, int prefix, int lineNumber) {
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.lineNumber = lineNumber;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public static UpdatePhoneNumer(int phoneNumber){
      this.lineNumber=phoneNumber;
  }
}
