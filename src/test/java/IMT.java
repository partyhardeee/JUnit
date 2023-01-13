import org.junit.Assert;
import org.junit.Test;


public class IMT {
    @Test //Проверка нижнего значения ИМТ
    public void When_IMTLessThan17() {
        float height = 180F;
        float weight = 40F;
        Assert.assertEquals("выраженному дефициту массы тела", IMTCalculate.getIMTResult(height, weight));
    }

    @Test //Проверка нижнего значения ИМТ
    public void When_IMTLessThan19() {
        float height = 180F;
        float weight = 59F;
        Assert.assertEquals("недостаточной массе тела", IMTCalculate.getIMTResult(height, weight));
    }

    @Test //Проверка среднего значения ИМТ
    public void When_IMTLessThan25() {
        float height = 180F;
        float weight = 75F;
        Assert.assertEquals("нормальной массе тела", IMTCalculate.getIMTResult(height, weight));
    }

    @Test //Проверка высшего значения ИМТ
    public void When_IMTMoreThan25() {
        float height = 180F;
        float weight = 89F;
        Assert.assertEquals("избыточной массе тела", IMTCalculate.getIMTResult(height, weight));
    }


    @Test //Проверка некорректного значения роста
    public void When_HeigthIsWrongLow() {
        float height = 0F;
        float weight = 75F;
        Assert.assertEquals("указан некорректный рост", IMTCalculate.getIMTResult(height, weight));
    }

    @Test //Проверка некорректного значения роста
    public void When_HeigthIsWrongHigh() {
        float height = 351F;
        float weight = 75F;
        Assert.assertEquals("указан некорректный рост", IMTCalculate.getIMTResult(height, weight));
    }


    @Test //Проверка некорректного значения веса
    public void When_WeigthIsWrongLow() {
        float height = 180F;
        float weight = 0F;
        Assert.assertEquals("указан некорректный вес", IMTCalculate.getIMTResult(height, weight));
    }

    @Test //Проверка некорректного значения веса
    public void When_WeigthIsWrongHigh() {
        float height = 180F;
        float weight = 1001F;
        Assert.assertEquals("указан некорректный вес", IMTCalculate.getIMTResult(height, weight));
    }

    @Test //Проверка некорректного значения веса
    public void When_WeigthAndHeigthWrong() {
        float height = 0F;
        float weight = 0F;
        Assert.assertEquals("указан некорректный вес", IMTCalculate.getIMTResult(height, weight));
    }

}


