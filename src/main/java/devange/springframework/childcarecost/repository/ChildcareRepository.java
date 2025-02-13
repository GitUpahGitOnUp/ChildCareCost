package devange.springframework.childcarecost.repository;

import devange.springframework.childcarecost.entities.ProviderContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildcareRepository extends JpaRepository<ProviderContactInfo, Long> {
}
