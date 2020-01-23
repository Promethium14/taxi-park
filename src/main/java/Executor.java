import mapper.AddressMapper;
import mapper.PersonMapper;
import model.Address;
import model.Person;
import org.apache.ibatis.session.SqlSession;
import util.LoggerUtil;
import util.MyBatisConfigUtil;

import java.util.List;

public class Executor {

    private static final String PROPERTIES_FILE_NAME = "taxi-park.properties";

    public static void main(String[] args) {

        SqlSession sqlSession = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        AddressMapper addressMapper;
        List<Address> addressList;

        addressMapper = sqlSession.getMapper(AddressMapper.class);

        sqlSession.commit();
        addressList = addressMapper.getAddress();
        sqlSession.close();

        for (Address address: addressList) {
            LoggerUtil.LOGGER.info("Address: " + address.getId());
        }
    }
}
