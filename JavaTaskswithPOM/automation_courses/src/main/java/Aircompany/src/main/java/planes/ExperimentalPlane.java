package planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane {

    private final ExperimentalTypes type;
    private final ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model,
                             int maxSpeed,
                             int maxFlightDistance,
                             int maxLoadCapacity,
                             ExperimentalTypes type,
                             ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    /**
     * //TODO УДАЛИТЬ ВЕСЬ КОММЕНТ
     * Я удалил этот метод тк он не использовался в проекте.
     *
     public void setClassificationLevel(ClassificationLevel classificationLevel){
     this.classificationLevel = classificationLevel;
     }
     * */


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ExperimentalPlane that = (ExperimentalPlane) o;

        if (type != that.type) return false;
        return classificationLevel == that.classificationLevel;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (classificationLevel != null ? classificationLevel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + type +
                        ", classificationLevel=" + classificationLevel +
                        '}');
    }
}

