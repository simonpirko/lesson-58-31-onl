package by.tms.lesson5831onl.repository;

import by.tms.lesson5831onl.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
