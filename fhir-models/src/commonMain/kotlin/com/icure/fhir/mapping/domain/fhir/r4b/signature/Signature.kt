//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.signature

import com.icure.fhir.mapping.domain.fhir.r4b.Element
import com.icure.fhir.mapping.domain.fhir.r4b.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A Signature - XML DigSig, JWS, Graphical image of signature, etc.
 *
 * A signature along with supporting context. The signature may be a digital signature that is
 * cryptographic in nature, or some other signature acceptable to the domain. This other signature may
 * be as simple as a graphical image representing a hand-written signature, or a signature ceremony
 * Different signature approaches have different utilities.
 *
 * @param id Unique id for inter-element referencing
 * @param when_fhir When the signature was created
 * @param who Who signed
 * @param onBehalfOf The party represented
 * @param targetFormat The technical format of the signed resources
 * @param sigFormat The technical format of the signature
 * @param data The actual signature content (XML DigSig. JWS, picture, etc.)
 */
@SerialName("Signature")
@Serializable
public data class Signature(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  public val type: List<Coding> = emptyList(),
  /**
   * When the signature was created
   */
  @SerialName("when")
  public val when_fhir: String? = null,
  /**
   * Who signed
   */
  public val who: Reference,
  /**
   * The party represented
   */
  public val onBehalfOf: Reference? = null,
  /**
   * The technical format of the signed resources
   */
  public val targetFormat: String? = null,
  /**
   * The technical format of the signature
   */
  public val sigFormat: String? = null,
  /**
   * The actual signature content (XML DigSig. JWS, picture, etc.)
   */
  public val `data`: String? = null,
) : Element
