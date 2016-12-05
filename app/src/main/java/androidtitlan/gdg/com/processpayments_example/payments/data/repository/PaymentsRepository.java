package androidtitlan.gdg.com.processpayments_example.payments.data.repository;

import androidtitlan.gdg.com.processpayments_example.payments.domain.model.PaymentResponse;
import com.stripe.android.model.Card;
import java.util.List;
import rx.Observable;

/**
 * Repositorio manejar las opciones de pago.
 *
 * @see <p>Para más información investigar más sobre <a href="http://fernandocejas.com/2014/09/03/architecting-android-the-clean-way/">Clean
 * Architecture</a> y el <a href="http://martinfowler.com/eaaCatalog/repository.html">Patrón
 * Repositorio.</a></p>
 */
public interface PaymentsRepository {
  Observable<PaymentResponse> addCardStripe(Card cardStripeEntity);

  Observable<List<PaymentResponse>> getPayments();
}