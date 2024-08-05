package com.kotdev.abzagency.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\u0003H\u0002J\u0006\u0010\r\u001a\u00020\u0003J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/kotdev/abzagency/presentation/viewmodel/HistoryViewModel;", "Lcom/kotdev/abzagency/core/viewmodel/BaseViewModel;", "Lcom/kotdev/abzagency/presentation/viewmodel/HistoryViewState;", "", "Lcom/kotdev/abzagency/presentation/viewmodel/HistoryEvent;", "repository", "Lcom/kotdev/abzagency/domain/repository/MainRepository;", "(Lcom/kotdev/abzagency/domain/repository/MainRepository;)V", "paging", "Lcom/kotdev/abzagency/data/paging/CommonPaging;", "", "Lcom/kotdev/abzagency/database/HistoryWithDuplicate;", "histories", "loadNextItems", "obtainEvent", "viewEvent", "remove", "item", "Lcom/kotdev/abzagency/presentation/viewmodel/model/RequestItem;", "presentation_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class HistoryViewModel extends com.kotdev.abzagency.core.viewmodel.BaseViewModel<com.kotdev.abzagency.presentation.viewmodel.HistoryViewState, kotlin.Unit, com.kotdev.abzagency.presentation.viewmodel.HistoryEvent> {
    @org.jetbrains.annotations.NotNull()
    private final com.kotdev.abzagency.domain.repository.MainRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.kotdev.abzagency.data.paging.CommonPaging<java.lang.Integer, com.kotdev.abzagency.database.HistoryWithDuplicate> paging = null;
    
    @javax.inject.Inject()
    public HistoryViewModel(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.domain.repository.MainRepository repository) {
        super(null);
    }
    
    public final void loadNextItems() {
    }
    
    private final void histories() {
    }
    
    @java.lang.Override()
    public void obtainEvent(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.presentation.viewmodel.HistoryEvent viewEvent) {
    }
    
    private final void remove(com.kotdev.abzagency.presentation.viewmodel.model.RequestItem item) {
    }
}