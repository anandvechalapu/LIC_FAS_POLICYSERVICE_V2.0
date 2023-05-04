@Repository
public interface CommonStatusRepository extends JpaRepository<CommonStatus, Long> {

    //Return a list of all common statuses
    List<CommonStatus> findAll();

    //Return a list of common statuses with a specific type
    List<CommonStatus> findByType(String type);

    //Return a list of active common statuses
    List<CommonStatus> findByIsActive(boolean isActive);

    //Return a common status with a specific id
    CommonStatus findById(Long id);

    //Return a common status with a specific code
    CommonStatus findByCode(String code);
}