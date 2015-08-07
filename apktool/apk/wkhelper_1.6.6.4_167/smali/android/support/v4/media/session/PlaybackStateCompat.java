package android.support.v4.media.session; class PlaybackStateCompat { void a() { int a;
a=0;// .class public final Landroid/support/v4/media/session/PlaybackStateCompat;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Parcelable;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final a:I
a=0;// 
a=0;// .field private final b:J
a=0;// 
a=0;// .field private final c:J
a=0;// 
a=0;// .field private final d:F
a=0;// 
a=0;// .field private final e:J
a=0;// 
a=0;// .field private final f:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private final g:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/media/session/b;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/media/session/b;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/media/session/b;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/session/b;);
a=0;//     sput-object v0, Landroid/support/v4/media/session/PlaybackStateCompat;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/os/Parcel;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/media/session/PlaybackStateCompat;);
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->a:I
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->b:J
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->d:F
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iput-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->g:J
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     iput-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->c:J
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     iput-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->e:J
a=0;// 
a=0;//     sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable$Creator;);
a=0;//     invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/CharSequence;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->f:Ljava/lang/CharSequence;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/os/Parcel;B)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(Landroid/os/Parcel;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/media/session/PlaybackStateCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final describeContents()I
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final toString()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "PlaybackState {"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "state="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, ", position="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-wide v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->b:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, ", buffered position="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-wide v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->c:J
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, ", speed="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->d:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, ", updated="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-wide v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->g:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, ", actions="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-wide v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->e:J
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, ", error="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->f:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "}"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final writeToParcel(Landroid/os/Parcel;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->b:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->d:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V
a=0;// 
a=0;//     iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->g:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V
a=0;// 
a=0;//     iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->c:J
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V
a=0;// 
a=0;//     iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->e:J
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->f:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v0, p1, p2}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
