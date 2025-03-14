package com.git.sweetmanager.payment.application.internal.queryservices.subscription;

import com.git.sweetmanager.payment.domain.model.aggregates.Subscription;
import com.git.sweetmanager.payment.domain.model.queries.subscription.GetAllSubscriptionsQuery;
import com.git.sweetmanager.payment.domain.model.queries.subscription.GetSubscriptionByIdQuery;
import com.git.sweetmanager.payment.domain.services.subscription.SubscriptionQueryService;
import com.git.sweetmanager.payment.infrastructure.persistence.mongo.repositories.subscription.SubscriptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriptionQueryServiceImpl implements SubscriptionQueryService {

    private final SubscriptionRepository subscriptionRepository;

    public SubscriptionQueryServiceImpl(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    @Override
    public List<Subscription> handle(GetAllSubscriptionsQuery query) {
        return subscriptionRepository.findAll();
    }

    @Override
    public Optional<Subscription> handle(GetSubscriptionByIdQuery query) {
        return subscriptionRepository.findById(query.subscriptionId());
    }

}
