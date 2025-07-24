//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.consent

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Computable version of the backing policy
 *
 * A Reference or URL used to uniquely identify the policy the organization will enforce for this
 * Consent. This Reference or URL should be specific to the version of the policy and should be
 * dereferencable to a computable policy of some form.
 *
 * @param id Unique id for inter-element referencing
 * @param reference Reference backing policy resource
 * @param url URL to a computable backing policy
 */
@SerialName("ConsentPolicyBasis")
@Serializable
public data class ConsentPolicyBasis(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Reference backing policy resource
   */
  public val reference: Reference? = null,
  /**
   * URL to a computable backing policy
   */
  public val url: String? = null,
) : BackboneElement
