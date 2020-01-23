package mapper;

import model.Office;

import java.util.List;

public interface OfficeMapper {

    Office getOfficeById(Long id);

    List<Office> getOffice();

    void insertOffice(Office entity);

    void deleteOffice(Office entity);

    void updateOffice(Office entity);
}
