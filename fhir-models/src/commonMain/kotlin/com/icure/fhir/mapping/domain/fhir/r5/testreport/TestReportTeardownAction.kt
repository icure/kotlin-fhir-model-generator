//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.testreport

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * One or more teardown operations performed
 *
 * The teardown action will only contain an operation.
 *
 * @param id Unique id for inter-element referencing
 * @param operation The teardown operation performed
 */
@SerialName("TestReportTeardownAction")
@Serializable
public data class TestReportTeardownAction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The teardown operation performed
   */
  public val operation: TestReportSetupActionOperation,
) : BackboneElement
