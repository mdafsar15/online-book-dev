package com.bridgelabz.bookstore.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bridgelabz.bookstore.model.CartModel;

@Repository
@Transactional
public interface CartRepository extends JpaRepository<CartModel, Long> {

	@Query(value = "select * from Cart where book_id=?", nativeQuery = true)
	Optional<CartModel> findByBookId(Long book_id);

	@Query(value = "select * from Cart where book_id=? and user_id=?", nativeQuery = true)
	Optional<CartModel> findByBookIdAndUserId(Long book_id, Long user_id);

	List<CartModel> findAllByUserId(long id);

	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value = "UPDATE bookstorebackendapi.cart SET quantity=:quantity  WHERE id =:cartId", nativeQuery = true)
	Integer updateQuantity(int quantity, Long cartId);

	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value = "delete from bookstorebackendapi.cart where id=:cartId", nativeQuery = true)
	Integer removeFromCart(Long cartId);

	void deleteAllByUserId(long id);

}
