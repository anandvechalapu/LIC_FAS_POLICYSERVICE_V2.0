@Repository
public interface StatusCommonRepository extends JpaRepository<StatusCommon, Long> {

    // Get all common statuses
    List<StatusCommon> findAllByOrderByIdAsc();

    // Get a common status by its id
    Optional<StatusCommon> findById(Long id);

    // Get a list of common statuses by code
    List<StatusCommon> findByCodeOrderByIdAsc(String code);

    // Get a list of common statuses by type
    List<StatusCommon> findByTypeOrderByIdAsc(String type);

    // Get a list of active common statuses
    List<StatusCommon> findByIsActiveTrueOrderByIdAsc();

    // Get a list of inactive common statuses
    List<StatusCommon> findByIsActiveFalseOrderByIdAsc();

}