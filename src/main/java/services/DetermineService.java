package services;

import org.springframework.stereotype.Service;

/**
 * Сервис для обработки бизнес-логики по расчету отпускных
 */
@Service
public class DetermineService {
    public DetermineService() {
    }

    /**
     * Метод для расчета отпусных по среднемесячной ЗП и количеству отпусных дней
     * @param avgSalary Среднемесячная ЗП
     * @param days Длительность отпуска в днях
     * @return Отпускные
     */
    public double determine(double avgSalary, int days) {
        int avgNumberDaysOfYear = 21;
        double avgDailySal = avgSalary / avgNumberDaysOfYear;
        return avgDailySal * days;
    }
}
